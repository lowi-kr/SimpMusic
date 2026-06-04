package com.arubr.smsvcodes.di

import com.arubr.smsvcodes.viewModel.AlbumViewModel
import com.arubr.smsvcodes.viewModel.AnalyticsViewModel
import com.arubr.smsvcodes.viewModel.ArtistViewModel
import com.arubr.smsvcodes.viewModel.HomeViewModel
import com.arubr.smsvcodes.viewModel.LibraryDynamicPlaylistViewModel
import com.arubr.smsvcodes.viewModel.LibraryViewModel
import com.arubr.smsvcodes.viewModel.LocalPlaylistViewModel
import com.arubr.smsvcodes.viewModel.LogInViewModel
import com.arubr.smsvcodes.viewModel.MoodViewModel
import com.arubr.smsvcodes.viewModel.MoreAlbumsViewModel
import com.arubr.smsvcodes.viewModel.NotificationViewModel
import com.arubr.smsvcodes.viewModel.NowPlayingBottomSheetViewModel
import com.arubr.smsvcodes.viewModel.PlaylistViewModel
import com.arubr.smsvcodes.viewModel.PodcastViewModel
import com.arubr.smsvcodes.viewModel.RecentlySongsViewModel
import com.arubr.smsvcodes.viewModel.SearchViewModel
import com.arubr.smsvcodes.viewModel.SettingsViewModel
import com.arubr.smsvcodes.viewModel.SharedViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule =
    module {
        single {
            SharedViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        single {
            SearchViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            NowPlayingBottomSheetViewModel(
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryDynamicPlaylistViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AlbumViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            HomeViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            SettingsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            ArtistViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            PlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LogInViewModel(
                get(),
            )
        }
        viewModel {
            PodcastViewModel(
                get(),
            )
        }
        viewModel {
            MoreAlbumsViewModel(
                get(),
            )
        }
        viewModel {
            RecentlySongsViewModel(
                get(),
            )
        }
        viewModel {
            LocalPlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            NotificationViewModel(
                get(),
            )
        }
        viewModel {
            MoodViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AnalyticsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
    }