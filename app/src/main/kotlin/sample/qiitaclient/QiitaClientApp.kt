package sample.qiitaclient

/**
 * Created by 0000109384 on 2017/02/21.
 */

import android.app.Application
import sample.qiitaclient.dagger.AppComponent
import sample.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}