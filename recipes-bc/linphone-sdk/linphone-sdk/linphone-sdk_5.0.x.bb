# Used on the release 4.5 branch, for a stable version please use the "latest" recipe
VERSION_DEPENDENT_DEPENDS="python3-native python3-pystache-native python3-six-native"
VERSION_DEPENDENT_INHERIT="python3native"

# The default commit sha used if LINPHONE_SDK_REV is not set and LATEST_REVISIONS disabled
# 5.0.27
DEFAULT_COMMIT="9e732013075c578fa4d54b4e535757af196212d7"

require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"
PV = "5.0.x"
PKGV = "${GITPKGVTAG}"

