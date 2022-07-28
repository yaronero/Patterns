package com.example.patterns.data.builders

class SmartphoneAdvBuilder private constructor(
    val model: String,
    val price: Int,
    val description: String?,
    val memorySize: Int?,
    val cameraAmount: Int?,
    val diagonal: String?
) {

    data class Builder(
        var model: String,
        var price: Int,
        var description: String? = null,
        var memorySize: Int? = null,
        var cameraAmount: Int? = null,
        var diagonal: String? = null
    ) {

        fun setDescription(description: String) = apply { this.description = description }

        fun setMemorySize(memorySize: Int) = apply { this.memorySize = memorySize }

        fun setCameraAmount(cameraAmount: Int) = apply { this.cameraAmount = cameraAmount }

        fun setDiagonal(diagonal: String) = apply { this.diagonal = diagonal }

        fun build() = SmartphoneAdvBuilder(
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