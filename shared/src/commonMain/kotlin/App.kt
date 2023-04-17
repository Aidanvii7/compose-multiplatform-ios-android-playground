import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme {
        var counter: Int by rememberSaveable { mutableStateOf(0) }
        Scaffold(
            topBar = { TopAppBar { Text("Compose Multiplatform demo on $platformName") } },
            floatingActionButton = {
                FloatingActionButton(onClick = { counter++ }) {
                    Icon(
                        Icons.Filled.Add,
                        contentDescription = null,
                    )
                }
            }
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Text("You have pushed the button $counter times")
            }
        }
    }
}

expect val platformName: String