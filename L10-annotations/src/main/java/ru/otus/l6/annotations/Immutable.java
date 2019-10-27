package ru.otus.l6.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
//@Target({ElementType.TYPE_USE})
@Target({ElementType.TYPE_PARAMETER, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface Immutable {
}
