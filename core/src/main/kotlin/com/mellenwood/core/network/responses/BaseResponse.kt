package com.mellenwood.core.network.responses

import com.mellenwood.core.annotations.OpenForTesting

/**
 * Generic network response for any type data [T].
 *
 * @param data The results returned by the call.
 */
@OpenForTesting
data class BaseResponse<T>(
    val data: DataResponse<T>
)