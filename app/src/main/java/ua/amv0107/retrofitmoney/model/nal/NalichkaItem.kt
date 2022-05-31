package ua.amv0107.retrofitmoney.model.nal

data class NalichkaItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)