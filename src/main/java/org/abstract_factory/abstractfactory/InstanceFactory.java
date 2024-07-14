package org.abstract_factory.abstractfactory;

import org.abstract_factory.Instances;
import org.abstract_factory.Storage;

public interface InstanceFactory {
    Instances createInstance(Instances instances);
    Storage createStorage(Storage storage);
}
