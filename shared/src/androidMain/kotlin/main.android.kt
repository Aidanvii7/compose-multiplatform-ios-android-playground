import androidx.compose.runtime.Composable

actual val platformName: String
    get() = "Android"

@Composable fun MainView() = App()
