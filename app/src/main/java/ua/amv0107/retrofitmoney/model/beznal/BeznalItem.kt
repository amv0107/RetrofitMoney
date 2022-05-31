package ua.amv0107.retrofitmoney.model.beznal

data class BeznalItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)