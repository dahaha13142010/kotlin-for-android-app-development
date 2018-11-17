import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

// Launches non-blocking coroutine
launch {
  println("Coroutine started")   // 2nd print
  delay(1000)                    // Calls suspending function from within coroutine
  println("Coroutine finished")  // 3rd print
}

println("main() continues")      // 1st print
Thread.sleep(1500)               // Keep program alive
println("main() finished")       // 4th print