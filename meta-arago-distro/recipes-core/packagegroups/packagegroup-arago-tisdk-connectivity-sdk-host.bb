DESCRIPTION = "Task to install wlan and bluetooth sources into the SDK"
LICENSE = "MIT"
PR = "r5"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

FIRMWARE_AND_DRIVERS_SRC = "\
    ti-compat-wireless-wl12xx-src \
    ti-compat-bluetooth-src \
    bt-firmware-src \
    bt-enable-src \
"

CONNECTIVITY_RDEPENDS = ""

CONNECTIVITY_RDEPENDS_am37x-evm = "${FIRMWARE_AND_DRIVERS_SRC}"
CONNECTIVITY_RDEPENDS_am180x-evm = "${FIRMWARE_AND_DRIVERS_SRC}"
CONNECTIVITY_RDEPENDS_ti33x = "${@base_contains('ARAGO_BRAND','amsdk','${FIRMWARE_AND_DRIVERS_SRC}','',d)}"

RDEPENDS_${PN} = "\
    ${CONNECTIVITY_RDEPENDS} \
"
