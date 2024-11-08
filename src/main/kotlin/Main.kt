import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        Text(
            text = "Fabio's Instagram",
            fontSize = TextUnit(value = 35f, type = TextUnitType.Sp)
        )
        Text(
            text = "Historias",
            fontSize = TextUnit(value = 20f, type = TextUnitType.Sp)
        )

        Row(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            accounts.forEach { account ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.width(80.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Red, CircleShape),
                        painter = painterResource(resourcePath = account.image),
                        contentDescription = "Foto de ${account.name}"
                    )
                    Text(
                        text = account.name,
                        style = MaterialTheme.typography.subtitle2,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }
        }
        Text(
            text = "Publicaciones",
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
