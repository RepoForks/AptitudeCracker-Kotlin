package com.droidacid.apticalc.common.mvp

/**
 * Created by shivam on 3/9/17.
 */
interface Presenter<V> {

    fun attachView(view: V)

    fun detachView()

}