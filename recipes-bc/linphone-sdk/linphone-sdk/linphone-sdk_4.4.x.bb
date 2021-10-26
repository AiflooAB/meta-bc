# Used on the release 4.5 branch, for a stable version please use the "latest" recipe
VERSION_DEPENDENT_DEPENDS="python3-native python3-pystache-native python3-six-native"
VERSION_DEPENDENT_INHERIT="python3native"

# The default commit sha used if LINPHONE_SDK_REV is not set and LATEST_REVISIONS disabled
# 4.5.14
DEFAULT_COMMIT="d4d6356a615e2eec7ea1a957ec40f6fd143f6006"

require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"
PV = "4.4.x"
PKGV = "${GITPKGVTAG}"

