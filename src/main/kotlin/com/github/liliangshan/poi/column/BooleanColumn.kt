package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * BooleanColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class BooleanColumn(index: Int, key: String, value: Boolean) : AbstractColumn<Boolean>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.BOOLEAN
    }

    override fun toLong(): Long {
        return if (this.value()) 1L else 0L
    }

    override fun toInt(): Int {
        return this.toLong().toInt()
    }

    override fun toBoolean(): Boolean {
        return this.value()
    }

    override fun toFloat(): Float {
        return this.toInt().toFloat()
    }

    override fun toDouble(): Double {
        return this.toLong().toDouble()
    }

    override fun toText(): String {
        return this.value().toString()
    }

    override fun toDate(): Date {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toDecimal(): BigDecimal {
        return this.toLong().toBigDecimal()
    }

}