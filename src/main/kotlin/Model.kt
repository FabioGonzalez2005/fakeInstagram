data class Account (val name: String, val image: String)
val accounts = listOf<Account>(
    Account("cagarro_futbol", "amaro.jpg"),
    Account("iriemdaoscuridad", "iriem.jpg"),
    Account("ferprogamer23", "fer.jpg"),
    Account("unaigatitagangster", "unai.jpg"),
    Account("simongoofy", "simon.jpg")
)

data class Post (val postImage: String, val authorIcon: String, val authorName: String, val description: String)
val posts = listOf<Account>(
    Post("amaro.jpg","cagarro_futbol", "amaro.jpg"),
    Post("iriemdaoscuridad", "iriem.jpg"),
    Post("ferprogamer23", "fer.jpg"),
    Post("unaigatitagangster", "unai.jpg"),
    Post("simongoofy", "simon.jpg")
)
