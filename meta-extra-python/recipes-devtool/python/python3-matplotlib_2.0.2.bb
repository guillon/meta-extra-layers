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

SRC_URI[md5sum] = "061111784278bde89b5d4987014be4ca"
SRC_URI[sha256sum] = "0ffbc44faa34a8b1704bc108c451ecf87988f900ef7ce757b8e2e84383121ff1"

PYPI_PACKAGE = "matplotlib"
PV = "2.0.2"
inherit pypi setuptools3
