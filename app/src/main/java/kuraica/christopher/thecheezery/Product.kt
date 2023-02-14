package kuraica.christopher.thecheezery

/**
 * Created by Christopher Kuraica on 2020-01-20.
 *  This class represents a product
 *  @param name The name of the product
 *  @param description The description of the product
 *  @param price The price of the product
 *  @param image The image of the product
 */
data class Product (
    var name: String,
    var image: Int,
    var description: String,
    var price: Double
)