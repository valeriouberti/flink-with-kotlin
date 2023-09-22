package it.valeriouberti.model

import com.lapanthere.flink.api.kotlin.typeutils.DataClassTypeInfoFactory
import kotlinx.serialization.Serializable
import org.apache.flink.api.common.typeinfo.TypeInfo

@TypeInfo(DataClassTypeInfoFactory::class)
data class SensorData(
    val sensorId: String,
    val timestamp: Long,
    val value: Double,
    val unit: String,
    val location: Location,
    val sensorType: String,
    val status: String
)

@TypeInfo(DataClassTypeInfoFactory::class)
data class Location(
    val latitude: Double,
    val longitude: Double
)