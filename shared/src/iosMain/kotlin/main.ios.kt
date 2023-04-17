import androidx.compose.ui.window.ComposeUIViewController

actual val platformName: String
    get() = "iOS"

fun MainViewController() = ComposeUIViewController { App() }