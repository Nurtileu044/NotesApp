package kz.ablazim.notesapp

import android.app.Application
import timber.log.Timber

class NoteApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}