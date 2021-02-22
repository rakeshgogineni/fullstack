:beginner: **exception**  

- try alone FALSE
- try with finally TRUE
- try with catch TRUE
- try with finally followed by catch FALSE
- try with catch, some lines in between try and catch block. FALSE
- try with multiple catches TRUE
- try with multiple catches containing same exceptions FALSE
- try with multiple catches with specific to generic TRUE
- try with multiple catches generic to specific FALSE
- we cannot throw anything that does not extend Throwable TRUE
- Errors are programmatically unrecoverable in any way and is usually not to be caught TRUE
- jvm related issues are Errors TRUE
- types of exceptions are checked and unchecked.
- Anything that is a subclass of Exception except for RuntimeException and its subclasses is a checked exception. TRUE