import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// CoroutineName
val name = CoroutineName("Koroutine")

GlobalScope.launch(name) { }  // Avoid GlobalScope in production code

// CoroutineExceptionHandler
val exceptionHandler = CoroutineExceptionHandler { context, exception ->
  println("Crashed with context $context")
  exception.printStackTrace()
}

GlobalScope.launch(exceptionHandler) { }  // Avoid GlobalScope in production code
