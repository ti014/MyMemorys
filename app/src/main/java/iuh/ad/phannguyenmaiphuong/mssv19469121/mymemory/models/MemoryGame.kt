package iuh.ad.phannguyenmaiphuong.mssv19469121.mymemory.models

import iuh.ad.phannguyenmaiphuong.mssv19469121.mymemory.utils.DEFAULT_ICONS

class MemoryGame(private val boardSize: BoardSize){

    val cards: List<MemoryCard>
    val numPairsFound = 0

    init {
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }
    }
    fun flipCard(position: Int) {
        val card = cards[position]
        card.isFaceUp =! card.isFaceUp

    }
}
