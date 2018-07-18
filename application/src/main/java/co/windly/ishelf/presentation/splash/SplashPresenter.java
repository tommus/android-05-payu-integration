package co.windly.ishelf.presentation.splash;

import android.content.Context;
import android.support.annotation.NonNull;
import co.windly.ishelf.data.domain.manager.AccountDomainManager;
import co.windly.ishelf.presentation.base.activity.BasePresenter;

@SuppressWarnings("FieldCanBeLocal")
class SplashPresenter extends BasePresenter<SplashView> {

  //region Managers

  private AccountDomainManager accountManager;

  @Override
  protected void initializeManagers(@NonNull Context context) {
    super.initializeManagers(context);
    accountManager = new AccountDomainManager(context);
  }

  //endregion
}
