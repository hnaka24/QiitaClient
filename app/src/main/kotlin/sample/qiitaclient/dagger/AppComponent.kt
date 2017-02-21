package sample.qiitaclient.dagger

/**
 * Created by 0000109384 on 2017/02/21.
 */

import dagger.Component
import sample.qiitaclient.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}