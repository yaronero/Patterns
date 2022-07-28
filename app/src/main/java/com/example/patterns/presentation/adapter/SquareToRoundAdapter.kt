package com.example.patterns.presentation.adapter

import kotlin.math.sqrt

class SquareToRoundAdapter(
    var squarePeg: SquarePeg
) : RoundPeg(squarePeg.width / 2 * sqrt(2.0))