# Kotlin Map NullPointerException

This example demonstrates a common error when using the `map` function in Kotlin with lists containing nullable elements.  The `map` function throws a `NullPointerException` if it encounters a null value, because it tries to perform an operation (multiplication, in this case) on `null`. This is a typical error when not accounting for nulls in collections.