package co.windly.ishelf.data.domain;

import co.windly.ishelf.data.domain.manager.AccountDomainManager;
import co.windly.ishelf.data.persistence.PersistenceModule;
import dagger.Component;

@Component(modules = {
  PersistenceModule.class
})
public interface DomainComponent {

  //region Injections

  void inject(AccountDomainManager manager);

  //endregion
}
