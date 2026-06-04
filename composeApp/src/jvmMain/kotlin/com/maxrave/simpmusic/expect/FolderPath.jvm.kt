package com.arubr.smsvcodes.expect

actual fun getDownloadFolderPath(): String = System.getProperty("user.home") + "/Downloads"