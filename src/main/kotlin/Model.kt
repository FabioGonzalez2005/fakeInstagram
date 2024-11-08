data class Account (val name: String, val image: String)
val accounts = listOf<Account>(
    Account("cagarro_futbol", "amaro.jpg"),
    Account("iriemdaoscuridad", "iriem.jpg"),
    Account("ferprogamer23", "fer.jpg"),
    Account("unaigatitagangster", "unai.jpg"),
    Account("simongoofy", "simon.jpg"),
)

data class Post (val postImage: String, val authorIcon: String, val authorName: String, val description: String)
val posts = listOf<Post>(
    Post("postUnai.jpg","unai.jpg", "unaigatitagangster", "Hoy he destrozado a Laura en mi partida de Clash Royale, además mi vida a cambiado para mejor, esto se debe a que FER SE HA IDO DEL CLAN #adiosfer #lauraeresmalísima #soylider"),
    Post("postFer.jpg","fer.jpg", "ferprogamer23", "Fotos de mi última competición, los envidiosos dirán que no soy yo #mrolimpia #cbummepatrocina"),
)
