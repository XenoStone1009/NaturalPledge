package shadowfox.botanicaladdons.api.lib

/**
 * @author WireSegal
 * Created at 9:30 AM on 4/29/16.
 */
object LibOreDict {

    val COLORS = arrayOf("White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray",
            "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black", "Rainbow")

    val IRIS_DYE = Array(COLORS.size, { "irisDye" + COLORS[it] })
    val DYES = Array(COLORS.size, { "dye" + COLORS[it] })

    val HOLY_SYMBOL = "holySymbol"

}
