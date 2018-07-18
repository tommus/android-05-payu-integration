package co.windly.ishelf.data.persistence.manager;

import co.windly.ishelf.data.persistence.settings.SessionCachePrefs;
import javax.inject.Inject;

@SuppressWarnings("WeakerAccess")
public class AccountPersistenceManager {

  //region Fields

  @Inject
  SessionCachePrefs sessionCache;

  //endregion

  //region Constructor

  @Inject
  public AccountPersistenceManager() {
    // No-op.
  }

  //endregion
}
