SUMMARY = "matplotlib: plotting with Python"
DESCRIPTION = "\
Matplotlib is a Python 2D plotting library which produces \
publication-quality figures in a variety of hardcopy formats \
and interactive environments across platforms."
HOMEPAGE = "https://github.com/matplotlib/matplotlib"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE/LICENSE;md5=afec61498aa5f0c45936687da9a53d74"

DEPENDS = "python3-numpy-native python3-numpy freetype libpng python3-dateutil python3-pytz"
RDEPENDS_${PN} = "python3-numpy freetype libpng python3-dateutil python3-pytz"

SRC_URI[md5sum] = "5e8c690420499a6c170b2dbb1a091940"
SRC_URI[sha256sum] = "e1d33589e32f482d0a7d1957bf473d43341115d40d33f578dad44432e47df7b7"

PYPI_PACKAGE = "matplotlib"
PV = "3.0.3"
inherit pypi setuptools3
