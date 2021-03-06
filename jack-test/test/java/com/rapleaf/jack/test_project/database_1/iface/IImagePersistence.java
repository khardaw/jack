
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.Image;
import com.rapleaf.jack.test_project.database_1.query.ImageQueryBuilder;
import com.rapleaf.jack.test_project.database_1.query.ImageDeleteBuilder;

import java.io.IOException;
import java.util.Map;
import java.util.List;

import com.rapleaf.jack.IModelPersistence;

public interface IImagePersistence extends IModelPersistence<Image> {
  Image create(final Integer user_id) throws IOException;
  Image create() throws IOException;

  Image createDefaultInstance() throws IOException;
  List<Image> findByUserId(Integer value)  throws IOException;

  ImageQueryBuilder query();

  ImageDeleteBuilder delete();
}
