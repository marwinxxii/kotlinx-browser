/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.mediarecording

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
import org.w3c.files.*
import org.w3c.undefined

public expect open class MediaRecorder(stream: MediaStream, options: MediaRecorderOptions = definedExternally) : EventTarget, JsAny {
    open val stream: MediaStream
    open val mimeType: String
    open val state: RecordingState
    var onstart: ((Event) -> Unit)?
    var onstop: ((Event) -> Unit)?
    var ondataavailable: ((Event) -> Unit)?
    var onpause: ((Event) -> Unit)?
    var onresume: ((Event) -> Unit)?
    var onerror: ((Event) -> Unit)?
    open val videoBitsPerSecond: Int
    open val audioBitsPerSecond: Int
    open val audioBitrateMode: BitrateMode
    fun start(timeslice: Int = definedExternally): JsAny?
    fun stop(): JsAny?
    fun pause(): JsAny?
    fun resume(): JsAny?
    fun requestData(): JsAny?

    companion object {
        fun isTypeSupported(type: String): Boolean
    }
}

public expect interface MediaRecorderOptions : JsAny {
    open var mimeType: String? /* = "" */
    open var audioBitsPerSecond: Int?
    open var videoBitsPerSecond: Int?
    open var bitsPerSecond: Int?
    open var audioBitrateMode: BitrateMode? /* = BitrateMode.VARIABLE */
    open var videoKeyFrameIntervalDuration: Double?
    open var videoKeyFrameIntervalCount: Int?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaRecorderOptions(mimeType: String? = "", audioBitsPerSecond: Int? = undefined, videoBitsPerSecond: Int? = undefined, bitsPerSecond: Int? = undefined, audioBitrateMode: BitrateMode? = BitrateMode.VARIABLE, videoKeyFrameIntervalDuration: Double? = undefined, videoKeyFrameIntervalCount: Int? = undefined): MediaRecorderOptions

public expect open class BlobEvent : Event, JsAny {
    open val data: Blob
    open val timecode: Double

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface BlobEventInit : EventInit, JsAny {
    var data: Blob?
    open var timecode: Double?
}

@Suppress("UNUSED_PARAMETER")
public expect fun BlobEventInit(data: Blob?, timecode: Double? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): BlobEventInit

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface BitrateMode : JsAny {
    companion object
}

public expect inline val BitrateMode.Companion.CONSTANT: BitrateMode

public expect inline val BitrateMode.Companion.VARIABLE: BitrateMode

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RecordingState : JsAny {
    companion object
}

public expect inline val RecordingState.Companion.INACTIVE: RecordingState

public expect inline val RecordingState.Companion.RECORDING: RecordingState

public expect inline val RecordingState.Companion.PAUSED: RecordingState