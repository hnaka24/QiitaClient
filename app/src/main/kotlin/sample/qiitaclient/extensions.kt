package sample.qiitaclient

/**
 * Created by hiroichi.nakanishi on 2017/02/19.
 */

import android.support.annotation.IdRes
import android.view.View

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}