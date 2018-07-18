package co.windly.ishelf.application;

import android.app.Application;
import co.windly.ishelf.BuildConfig;
import co.windly.ishelf.utility.debug.Bugtracker;
import co.windly.ishelf.utility.debug.DebugBridge;
import co.windly.ishelf.utility.log.WiLogger;

public class iShelf extends Application {

  //region Lifecycle

  @Override
  public void onCreate() {
    super.onCreate();

    initializeBugtracker();
    initializeDebugBridge();
    initializeLogger();
  }

  //endregion

  //region Bugtracker

  private void initializeBugtracker() {
    Bugtracker.init(BuildConfig.ENABLE_BUG_TRACKER, this);
  }

  //endregion

  //region Debug Bridge

  private void initializeDebugBridge() {
    DebugBridge.init(BuildConfig.ENABLE_DEBUG_BRIDGE, this);
  }

  //endregion

  //region Logger

  private void initializeLogger() {
    WiLogger.init(BuildConfig.DEBUG);
  }

  //endregion
}
