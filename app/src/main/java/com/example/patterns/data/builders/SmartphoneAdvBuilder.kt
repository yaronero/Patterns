package com.example.patterns.data.builders

class SmartphoneAdvBuilder private constructor(
    private val model: String?,
    private val price: Int?,
    private val description: String?,
    private val memorySize: Int?,
    private val cameraAmount: Int?,
    private val diagonal: String?
) {

    class Builder {

        private var model: String? = null
        private var price: Int? = null
        private var description: String? = null
        private var memorySize: Int? = null
        private var cameraAmount: Int? = null
        private var diagonal: String? = null

        fun setModel(model: String): Builder = apply { this.model = model }

        fun setPrice(price: Int): Builder = apply { this.price = price }

        fun setDescription(description: String): Builder = apply { this.description = description }

        fun setMemorySize(memorySize: Int): Builder = apply { this.memorySize = memorySize }

        fun setCameraAmount(cameraAmount: Int): Builder = apply { this.cameraAmount = cameraAmount }

        fun setDiagonal(diagonal: String): Builder = apply { this.diagonal = diagonal }

        fun build(): SmartphoneAdvBuilder = SmartphoneAdvBuilder(
            model, price, description, memorySize, cameraAmount, diagonal
        )
    }

    override fun toString(): String {
        val str = StringBuilder()
        str.appendLine("Model: $model")
        str.appendLine("Price: $$price")
        description?.let {
            if (description.isNotBlank()) str.appendLine("Description: $description")
        }
        memorySize?.let {
            if (memorySize != 0) str.appendLine("Memory size: ${memorySize}GB")
        }
        cameraAmount?.let {
            if (cameraAmount != 0) str.appendLine("Camera's amount: $cameraAmount")
        }
        diagonal?.let {
            if (diagonal.isNotBlank()) str.appendLine("Diagonal: $diagonal")
        }
        return str.toString()
    }
}