package sample

class Book {

    String code
    String skucode
    Date createdOn

    static mapping = {
        table("mst_book")
        version(false)
        skucode column: 'SKU_CODE'
    }

    static constraints = {
        skucode nullable: true
    }
}
