package co.windly.ishelf.presentation.splash;

import co.windly.ishelf.presentation.base.activity.BaseView;

interface SplashView extends BaseView {

  //region Logo

  void animateLogo();

  //endregion

  //region Loading

  void showLoading(boolean flag);

  //endregion
}
