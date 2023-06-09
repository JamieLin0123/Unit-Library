package com.yitianyitiandan.unitlibrary

class HeightChild : UnitPaPa<Double, Double, HeightChild.HeightUnit>() {

    enum class HeightUnit : UnitConvert<Double, Double> {
        CM {
            override fun toBase(value: Double): Double {
                return value
            }

            override fun baseToValue(value: Double): Double {
                return value
            }

        },
        M {
            override fun toBase(value: Double): Double {
                return value * 100
            }

            override fun baseToValue(value: Double): Double {
                return value / 100
            }

        },
        KM {
            override fun toBase(value: Double): Double {
                return value * 100000
            }

            override fun baseToValue(value: Double): Double {
                return value / 100000
            }

        },
        MM {
            override fun toBase(value: Double): Double {
                return value / 10
            }

            override fun baseToValue(value: Double): Double {
                return value * 10
            }

        },
        MI {
            override fun toBase(value: Double): Double {
                return value * 160934.4
            }

            override fun baseToValue(value: Double): Double {
                return value / 160934.4
            }

        }
    }
}