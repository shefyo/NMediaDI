package ru.netology.nmedia.activity;
import android.content.Context
import com.google.firebase.messaging.FirebaseMessaging;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseMessaging(@ApplicationContext context: Context): FirebaseMessaging {
        return FirebaseMessaging.getInstance()
    }
}
