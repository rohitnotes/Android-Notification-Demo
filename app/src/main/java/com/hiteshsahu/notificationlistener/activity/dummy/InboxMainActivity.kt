/*
Copyright 2016 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.hiteshsahu.notificationlistener.activity.dummy

import android.app.Activity
import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import com.hiteshsahu.notificationlistener.NotificationDemoActivity
import com.hiteshsahu.notificationlistener.R

/**
 * Template class meant to include functionality for your email app. (This project's main focus
 * is on Notification Styles.)
 */
class InboxMainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox_main)

        // Cancel Notification
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.cancel(NotificationDemoActivity.NOTIFICATION_ID)

        // TODO: Handle and display email from your database
    }
}