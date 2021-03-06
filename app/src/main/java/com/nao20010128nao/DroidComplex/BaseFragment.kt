package com.nao20010128nao.DroidComplex

import android.content.Context
import android.support.annotation.*
import android.support.v4.app.*
import android.view.*

/**
 * Created by lesmi on 17/10/22.
 */
abstract class BaseFragment : Fragment() {
    /** Get its title  */
    abstract val name: String

    val nonNullContext: Context
            get() = context?:activity?:TheApplication.instance.get()!!
}
