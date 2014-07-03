/*
 * gretty
 *
 * Copyright 2013  Andrey Hihlovskiy.
 *
 * See the file "license.txt" for copying and usage permission.
 */
package org.akhikhl.gretty

/**
 *
 * @author akhikhl
 */
class PlatformUtils {

  static boolean isWindows() {
    System.getProperty('os.name', 'generic').toLowerCase().indexOf('win') >= 0
  }
}

