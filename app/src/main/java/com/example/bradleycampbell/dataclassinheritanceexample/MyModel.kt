package com.example.bradleycampbell.dataclassinheritanceexample

import paperparcel.PaperParcel

@PaperParcel
data class MyModel(val something: Int) : MyModelBase(something)

// This code will not work with PaperParcel, which is fine, but there's no error message being
// shown in kapt to inform the user what is wrong. It just says:
// e: ...MyModel.kt: (1, 1): Some error(s) occurred while processing annotations. Please see the error messages above.
//
// However, there are no error messages above.
open class MyModelBase(val willBreak: Int)
