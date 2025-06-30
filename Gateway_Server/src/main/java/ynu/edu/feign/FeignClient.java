package ynu.edu.feign;

public @interface FeignClient {
    String value();

    String name() default "";

    String contextId() default "";

    String url() default "";

    String path() default "";

    String qualifier() default "";

    String fallback() default "";

    Class<?>[] configuration() default {};

    Class<?>[] fallbackFactory() default {};

    boolean primary() default true;

    boolean decode404() default false;

    boolean ignoreGlobalScope() default false;
}
