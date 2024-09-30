package ru.netology.nmedia.activity

import android.content.Context
import com.google.android.gms.common.GoogleApiAvailability
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GoogleApiModule {
    @Provides
    @Singleton
    fun provideGoogleApiAvailability(@ApplicationContext context: Context): GoogleApiAvailability {
        return GoogleApiAvailability.getInstance()
    }
}
