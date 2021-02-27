package com.grenader.javatok8s.zerotohero.cdi;

import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.UnboundLiteral;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import javax.inject.Qualifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CDIExtension implements TestInstancePostProcessor {


    private static final SeContainer CONTAINER = SeContainerInitializer.newInstance().initialize();
    private static final Predicate<Annotation> FILTER = a -> a.annotationType().isAnnotationPresent(Qualifier.class);

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws IllegalAccessException {

        RequestContext requestContext = CONTAINER.select(RequestContext.class, UnboundLiteral.INSTANCE).get();
        if (!requestContext.isActive()) {
            requestContext.activate();
        }


        for (Field field : testInstance.getClass().getDeclaredFields()) {
            if (field.getAnnotation(Inject.class) != null) {
                Annotation[] qualifiers = Stream.of(field.getAnnotations())
                        .filter(FILTER)
                        .toArray(Annotation[]::new);
                Object injected = CONTAINER.select(field.getType(), qualifiers).get();
                field.setAccessible(true);
                field.set(testInstance, injected);
            }

        }


    }


}
