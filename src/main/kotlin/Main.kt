import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App() {
    Column(modifier = Modifier.padding(15.dp)) {
        accounts.forEach { account ->
            Card(
                Modifier
                    .size(width = 400.dp, height = 120.dp)
                    .padding(vertical = 10.dp),
                backgroundColor = Color.LightGray,
                contentColor = Color.White,
                elevation = 10.dp
            ) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        painter = painterResource(resourcePath = account.image),
                        contentDescription = "Foto de ${account.name}"
                    )
                    Column(modifier = Modifier.padding(start = 10.dp)) {
                        Text(account.name, style = MaterialTheme.typography.subtitle1)
                        Text(
                            modifier = Modifier.padding(top = 5.dp),
                            text = "Lorem ipsum",
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }
        }
        Text(
            text = "Form",
            modifier = Modifier.padding(top = 10.dp),
            fontSize = TextUnit(value = 20f, type = TextUnitType.Sp)
        )
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Fake Instagram",
        state = rememberWindowState(width = 800.dp, height = 600.dp)
    ) {
        App()
    }
}
