import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings


data class Account (val name: String, val image: String)

const val body = "Lorem ipsum dolor si asjfojsdoif jdsiofjdiosfj"

val accounts = listOf<Account>(
    Account("cagarro_futbol", "img1.jpg"),
    Account("iriemdaoscuridad", "img2.jpg"),
    Account("ferprogamer23", "img3.jpg"),
    Account("unaigatitagangster", "img4.jpg"),
    Account("simongoofy", "img5.jpg")
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Settings" to Icons.Default.Settings
)